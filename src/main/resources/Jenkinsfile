pipeline {
    agent any

    tools {
        maven "maven"
    }

    stages {
        stage('SCM Checkout') {
            steps {
               checkout scmGit(branches: [[name: '*/master']], extensions: [],
               userRemoteConfigs: [[url: 'https://github.com/manojbhale/jenkins-ci-cd.git']])
            }
        }

        stage("Maven Build Pocess"){
            steps{
                script{
                    sh 'mvn clean install'
                }
            }
        }

        stage("Deployed to Container"){
            steps{
                deploy adapters: [tomcat9(alternativeDeploymentContext: '',
                credentialsId: 'tomcat-pwd', path: '', url: 'http://localhost:9090/')],
                contextPath: 'jenkins-ci-cd-devops', war: '**/*.war'
            }
        }
    }

    post{
        always{
            emailext (
            subject: "Build ${currentBuild.fullDisplayName} - ${currentBuild.result}",
            body: """<p>Hi,</p>
                     <p>The build <b>${env.JOB_NAME} #${env.BUILD_NUMBER}</b> has finished with status: <b>${currentBuild.result}</b>.</p>
                     <p>Check details: <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>""",
            mimeType: 'text/html',
            to: 'manoj.bhale.05@gmail.com',
            replyTo: 'manoj.bhale.05@gmail.com',
            attachLog: true
)

        }
    }
}