//def mvnHome = tool 'maven'
pipeline {
agent any  
  environment {
    MVN_HOME = tool 'maven'
    }
  stages{
    stage('Build'){  
      steps{
          bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean install/)
        } 
      } 
    stage('Result'){
      steps{
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts 'target/*.jar'
        }
      }
  }

}
