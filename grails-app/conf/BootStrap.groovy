import keepintouch.*

class BootStrap {

    def init = { servletContext ->
	if(!Attendee.count()){

		new Attendee(name: "Alexandru Bolboaca", location: "Bucharest, Romania", email: "alexboly@gmail.com").save(failOnError:true)
		new Attendee(name: "Robert Mircea", location: "Bucharest, Romania", email: "robert.mircea@yahoo.com").save(failOnError:true)
	}
    }
    def destroy = {
    }
}
