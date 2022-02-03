// evaluate(new File("subTesting.groovy"))

def testSubGroovyFile() {
    // subTest = new subTesting()

    // subTest.mvnTest()

    echo 'testing inside testing.groovy javascript'
    sh 'npm i'
    sh 'npx mocha --no-timeouts "test/*.js"'
}

return this