// vars/constants.groovy
import groovy.transform.Field

@Field String AWS_ACCOUNT_ID = '920373030315'
@Field String AWS_DEFAULT_REGION = 'us-east-1'
@Field String IMAGE_REPO_NAME = 'sample-webapp'
@Field String GIT_REPO_URL = 'https://github.com/Chandan-2507/sample-webapp.git'

// Jenkins Credential IDs
@Field String GIT_CREDENTIALS_ID = 'Jenkinslatest'
@Field String ECR_CREDENTIALS_ID = 'AWS_Credentials'

def call() {
    return this
}
