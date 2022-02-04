evaluate(new File("subTesting.groovy"))

def testSubGroovyFile() {
    def subTest = new subTest()

    subTest.npmTest()
}

return this