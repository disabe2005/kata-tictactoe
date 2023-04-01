//def mvnHome = tool 'maven'
pipeline {
agent any  
  stages{
    stage('Build'){  
      steps{
          bat("C:\apache-maven-3.8.7\bin\mvn" -Dmaven.test.failure.ignore clean install/)
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
