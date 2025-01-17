pipeline {
    agent any
    

    stages {
        stage('Clone repository') {
            steps {	  
            checkout scm
            }
        }
        
        stage('get_commit_details') {
            steps {
             script {
                    MSG = sh ( script: 'git log -1 --pretty=%B', returnStdout: true ).trim()
                    AUTHOR = sh ( script: 'git log -1 --pretty=%ce', returnStdout: true ).trim()
              } 
           }
      }                

        stage('Build and Deploy to Application Server') {
            steps{
                 script{
                    echo scm.branches[0].name	
                    if (scm.branches[0].name == "main"){
                        sh '''#!/bin/bash
                        
                        sudo su
                        echo "hello world"
                        '''   
                    }
                
                }
                
            }
        }


    }   

}
