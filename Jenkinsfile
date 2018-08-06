pipeline {
   agent {
       docker {
           image 'maven:3-alpine'
           args '-v /root/.m2:/root/.m2'
       }
   }
   stages {
        stage('Start') {
             steps {
               slackSend (color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
             }
        }

       stage('Build') {
           steps {
               echo "Building"
               sh 'mvn -f phaseC/pom.xml compile'
               sh 'mvn -f phaseC/pom.xml package'
           }
       }
       stage('Test'){
           steps {
               echo "Testing"
               sh 'mvn -f phaseC/pom.xml test'
           }
       }
       stage('SonarQube') {
           steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn -f phaseC/pom.xml clean install'
                    sh 'mvn -f phaseC/pom.xml sonar:sonar'
                }
           }
       }
       stage('Quality') {
           steps {
                 sh 'sleep 30'
                 timeout(time: 10, unit: 'SECONDS') {
                      retry(5) {
                           script {
                           def qg = waitForQualityGate()
                           if (qg.status != 'OK') {
                                error "Pipeline aborted due to quality gate failure: ${qg.status}"
                                }
                          }
                      }
                 }
           }
       }
   }
   post {
       success {
          slackSend (color: '#00FF00', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
       }
       failure {
          slackSend (color: '#FF0000', message: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
       }
   }
}
