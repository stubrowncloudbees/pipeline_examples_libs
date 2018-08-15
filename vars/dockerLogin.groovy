def call(String credid) {
    withCredentials([usernamePassword(credentialsId: $ {
        credid
    }, passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}