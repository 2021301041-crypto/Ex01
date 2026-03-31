pipeline {
    agent any
    tools{
        maven 'my-maven'
    }

    stages {
        stage('0. 자동화 확인') {
            steps {
                echo '스테이지 출발'
            }
        }
        stage('1. Build') {
            steps {
                echo '메이븐으로 빌드'
                sh 'mvn clean package'
            }
        }
    }
}