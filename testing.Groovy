evaluate(new File("subTesting.groovy"))

def testSubGroovyFile() {
    subTest = new subTesting()

    subTest.npmTest()
}

return this