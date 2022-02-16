
@Library('sharedlibs') _ 
import org.foo.*

def testingGroovy
// def applitools = new Applitools(this)

pipeline {
    agent any
  tools { nodejs 'Node16.6.1' } // Pick your node version between 8, 10, 12, or 14

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('init') {
            steps {
                script {
                    testingGroovy = load "testing.groovy"
                    testingGroovy.checkout()
                    def applitools = new Applitools(this)
                }
                message("inside applitools sharedlib + init stage!")
            }
        }
        stage('build') {
            steps {
                    script {
                        testingGroovy.cleanInstall()
                        testingGroovy.echo();
                        testingGroovy.checkDirectory();
                    }
            }        
        }
        stage('test') {
            steps{
                Applitools(applitoolsApiKey: 'aSDUdmvAP1IwKVLmI996KxOk6MT3a2ZRaDGWRrn8Xh00110', notifyByCompletion: false, serverURL: 'https://eyes.applitools.com') {
                    script {
                        applitools.mvn()
                    }
                    // externalScript()
                }
            }
        }
    }
}

