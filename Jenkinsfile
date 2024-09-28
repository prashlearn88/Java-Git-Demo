pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello Build'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Hello Test'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Hello Deploy'
            }
        }
    }
    
    post
    {
        failure
        {
           build job: 'Build1', parameters: [string(name: 'Browser', value: 'Chrome')] 
        }
    }
}
