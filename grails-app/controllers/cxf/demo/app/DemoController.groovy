package cxf.demo.app

import com.cxf.demo.sample.client.SampleService
import net.webservicex.ICD9Soap

class DemoController {

    ICD9Soap icd9Client
    SampleService localClient

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
