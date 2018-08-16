def call(String credid) {
    withCredentials([usernamePassword(credentialsId: credid, passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login --password-stdin ${dpassword} -u ${duser}"

    }
}