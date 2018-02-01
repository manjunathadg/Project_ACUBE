# Project_ACUBE

This project has the following modules

	acube-db-service
	acube-eureka-service
	acube-security-auth-server
	acube-user-service
	acube-zuul-service
	

acube-db-service -> this service provides the user details of the userName provided
	URL -> http://localhost:8303/rest/db/manjudg

acube-eureka-service -> this is eureka registry server, this handles the service registration
	URL -> http://localhost:8301/
	
acube-security-auth-server -> this is a Security service which Authenticates the requesting system before providing the user details
	URL -> http://localhost:8302/uaa
	
acube-user-service -> user service provides the details of the logged in user
	URL -> http://localhost:8304/
	
acube-zuul-service -> this is a gateway service, which takes the request and redirects appropriately.
	URL -> http://localhost:8300/user/me