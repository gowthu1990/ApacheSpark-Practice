async function main() {
        const service = new Service();

        var hiddenNumber = service.generate()


        return service;
        }

class Service {
    function generate() {
        return new Promise((resolve,reject)=>{
            setTimeout(( ) =>{resolve(Math.random(0, 100))},100)
        });

    }

    function guess(num1) {
        return new Promise((resolve,reject)=>{
            setTimeout(( ) =>{resolve(num1 == generate())},100)
        });
        if(num1 == generate())
            "correct"
        else
            "reject"
    }

    function submit(num2) {

    }

}