pipeline {
  
  agent any
  
  stages {
    
    stage("build"){
      steps{
      echo 'building the application'
      bat "mvn clean"
      }
    }
    stage("test"){
      steps{
      echo 'testing the application'
       bat "mvn test"
    }
    }
    
    stage("deploy"){
      steps{
              echo 'deploying the application'
              bat "mvn compile"
      }
    }
  }
}
    
