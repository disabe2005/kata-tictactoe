def mvnHome = tool 'maven'
pipeline {
agent any  
  stages{
    stage('Build'){       
       withEnv(["MVN_HOME=$mvnHome"]) {
        bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean install/)
      }      
    }
    stage ('Result'){
      withEnv(["MVN_HOME=$mvnHome"]) {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
      }
    }
  }

}