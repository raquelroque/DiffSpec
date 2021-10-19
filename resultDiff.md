#### What's Changed
---

##### `POST` /user


###### Request:

Changed content type : `*/*`

* Changed property `firstName` (string -> integer)

##### `POST` /user/createWithArray


###### Request:

Changed content type : `*/*`

Changed items (object):

* Changed property `firstName` (string -> integer)

##### `POST` /user/createWithList


###### Request:

Changed content type : `*/*`

Changed items (object):

* Changed property `firstName` (string -> integer)

##### `GET` /user/{username}


###### Return Type:

Changed response : **200 OK**
> successful operation

* Changed content type : `application/xml`

    * Changed property `firstName` (string -> integer)

* Changed content type : `application/json`

    * Changed property `firstName` (string -> integer)

##### `PUT` /user/{username}


###### Request:

Changed content type : `*/*`

* Changed property `firstName` (string -> integer)

