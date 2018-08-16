def call(String credid) {
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}