properties([disableConcurrentBuilds()])

pipeline {
    agent {
        label 'master'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestamps()
    }
    stages {
        stage("First Step") {
            steps {
                sh 'ssh root@192.168.109.19 \'hostname\''
            }
        }
    }
}