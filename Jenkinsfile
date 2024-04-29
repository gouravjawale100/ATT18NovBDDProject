pipeline {
    agent any

    stages {
        stage('Build and run') {
          parallel {
            stage('master-agent-pipeline') {
             stages{
                stage('Executing using chrome browser') {
                steps {
                  bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Chrome"
                  }

                    post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
<p>Here is the detail of execution from Jenkins:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
Automation Team - ATT19Aug''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Execution on Chrome browser', to: 'jawalegourav@gmail.com'
        }
    }

                }
           }
              }
            stage('ubuntu-agent-pipeline') {
              stages{
                stage('Build ubuntu') {
                steps {
                   bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Firefox"
                  }

                    post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
<p>Here is the detail of execution from Jenkins:<br>

$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
Automation Team - ATT19Aug''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Execution on Chrome browser', to: 'jawalegourav@gmail.com'
        }
    }
                }
               }
              }
             }
            }
           }
          }