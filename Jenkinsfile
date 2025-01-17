pipeline {
    agent any
    
    stages {
        stage('Clone Repository') {
            steps {	  
                checkout scm // Clones the Git repository
            }
        }
        
        stage('Get Commit Details') {
            steps {
                script {
                    MSG = sh(script: 'git log -1 --pretty=%B', returnStdout: true).trim() // Fetches commit message
                    AUTHOR = sh(script: 'git log -1 --pretty=%ce', returnStdout: true).trim() // Fetches author email
                    echo "Commit Message: ${MSG}"
                    echo "Author Email: ${AUTHOR}"
                }
            }
        }

        stage('Build and Deploy to Application Server') {
            steps {
                script {
                    echo "Branch: ${scm.branches[0].name}" // Prints branch name
                    if (scm.branches[0].name == "main") {
                        sh '''
                        #!/bin/bash
                        sudo rsync --progress -r -e "ssh -i /home/ubuntu/jenkins-server-keys/serverkey.pem" \
                        /var/lib/jenkins/workspace/php_api_main/src/PHP_Files/* \
                        ubuntu@54.210.74.51:/var/www/html/backend/PHP_Files
                        '''
                    } else {
                        echo "Not the main branch. Skipping deployment."
                    }
                }
            }
        }
    }
}

