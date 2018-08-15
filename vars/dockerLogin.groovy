def call(String credentialsId) {
    withCredentials([usernamePassword(credentialsId: $ {
        credentialsId
    }, passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}