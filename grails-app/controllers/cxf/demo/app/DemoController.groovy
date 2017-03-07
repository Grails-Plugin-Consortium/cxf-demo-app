package cxf.demo.app

class DemoController {

    //todo: these can only be typed if already exist (must generate first wsdl-to-java
//    ICD9Soap icd9Client
    def icd9Client
//    com.cxf.demo.sample.client.SampleService localClient
    def localClient

    def index() {
        render(view: "/index")
    }

    def icd9() {
        String data
        try {
            data = icd9Client.getICD9ByDescription("Neoplasms")
        } catch (Exception e) {
            data = e.message
        }

        render(view: '/index', model: [data: data])
    }

    def local() {
        String data
        try {
            data = localClient.serviceMethod()
        } catch (Exception e) {
            data = e.message
        }

        render(view: '/index', model: [data: data])
    }
}
