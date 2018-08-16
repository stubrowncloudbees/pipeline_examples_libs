def call(String credid) {


    if (credid == null){
        credid = 'stu123'
    }

    echo "logging in using ${credid}"


    withCredentials([usernamePassword(credentialsId: credid, passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}