class subTest {
    def npmTest() {
        echo 'testing javascript'
        sh 'npm i'
        sh 'npx mocha --no-timeouts "test/*.js"'
    }

}

return subTest