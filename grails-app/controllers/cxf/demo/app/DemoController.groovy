package cxf.demo.app

import net.webservicex.ICD9Soap

class DemoController {

    ICD9Soap icd9Client

    def index() {
        render(view: "/index")
    }

    def icd9() {
        String data = ""
        try {
            data = icd9Client.getICD9ByDescription("Neoplasms")
        } catch (Exception e) {
            data = e.message
        }

        render(view: '/index', model: [data: data])
    }
}
