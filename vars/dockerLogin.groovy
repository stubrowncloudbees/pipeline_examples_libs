def call(String credid) {
    withCredentials([usernamePassword(credentialsId: 'github', passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}