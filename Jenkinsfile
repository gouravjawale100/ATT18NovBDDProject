pipeline {
    agent any

    stages {
        stage('Fetching from git') {
            steps {
                git credentialsId: '798a5080-8787-41ce-8d97-57fd50b8483a', url: 'https://github.com/gouravjawale100/ATT18NovBDDProject.git'
            }
        }
        stage('Execution of code over Chrome') {
            steps {
               bat "mvn -Dmaven.test.failure.ignore=true clean test -DcliBrowser=Chrome"
            }

         post
         {
            always{

            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
Please find the details about the execution :
$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:

Check console output at $BUILD_URL to view the results.

Thanks,
Regards,
ATT Nov Batch''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - on Chrome Browser', to: 'jenkinsatteveningnotification@gmail.com'
            }

         }   
        }

 stage('Execution of code over Firefox') {
            steps {
               bat "mvn -Dmaven.test.failure.ignore=true clean test -DcliBrowser=Firefox"
            }

         post
         {
            always{

            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
Please find the details about the execution :
$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:

Check console output at $BUILD_URL to view the results.

Thanks,
Regards,
ATT Nov Batch''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - on Firefox Browser', to: 'jenkinsatteveningnotification@gmail.com'
            }

         }   
        }


    }
}
