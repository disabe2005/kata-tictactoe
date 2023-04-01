pipeline {
agent any
  def mvnHome
  stages{
    stage('Build'){
       mvnHome = tool 'maven'
       withEnv(["MVN_HOME=$mvnHome"]) {
        bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean install/)
      }      
    }
    stage ('Result'){
      mvnHome = tool 'maven'
      withEnv(["MVN_HOME=$mvnHome"]) {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
      }
    }
  }

}
