// import subTesting
evaluate(new File("subTesting.groovy"))

def testSubGroovyFile() {
    subTest = new subTesting()

    subTest.mvnTest()
}

return this