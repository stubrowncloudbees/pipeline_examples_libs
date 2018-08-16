def call(String credid) {

    echo "stu"


    withCredentials([usernamePassword(credentialsId: credid, passwordVariable: 'dpassword', usernameVariable: 'duser')]) {
        sh "docker login -p ${dpassword} -u ${duser}"

    }
}