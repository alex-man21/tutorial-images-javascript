
def testSubGroovyFile() {
    subTest = new subTesting()

    subTest.mvnTest()
}

def echo() {
    echo "inside testing.groovy"
}

return this