def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    podTemplate(label: 'kubernetes',
            containers: [
                    containerTemplate(name: 'maven', image: 'maven:3.5.2-jdk-8-alpine', ttyEnabled: true, command: 'cat'),
                    containerTemplate(name: 'golang', image: 'golang:1.10-alpine3.7', ttyEnabled: true, command: 'cat')
            ]) {
        stage('Dummy') {
            node('kubernetes') {
                container('maven') {
                    sh 'mvn --version'
                }
            }
        }
        stage('Langy') {
            node('kubernetes') {
                container('golang') {
                    sh 'go version'
                }
            }
        }
    }
}
