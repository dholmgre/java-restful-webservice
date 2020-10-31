# java-restful-webservice

REST-API to add student and courses

##Usage:

#####Register a student

POST: localhost:8083/register/student

Body example: {
          "id": 4,
          "name": "Little Jerry Seinfeld",
          "description": "ROOSTER",
          "courses": null
      }

---------------
#####Get all students

GET: localhost:8083/student/allstudent

---------------
#####Get specific student

GET: localhost:8083/student/specific/{studentId}

---------------

#####Update a specific student

PUT: localhost:8083/update/student 

Body example: {
        "id": 4,
        "name": "Little Jerry Seinfeld",
        "description": "ROOSTER",
        "courses": null
    }


#####Delete specific student

DELETE: localhost:8083/delete/student/{studentId}

---------------
#####Register course

PUT: localhost:8083/register/course/{studentId}

Body example:
{
    "id": 5,
    "name": "Ancient Rome 1",
    "description": "History course on ancient rome",
    "steps": null
}

---------------
#####Get all courses for a specific student

GET: localhost:8083/course/allcourses/{studentId}

---------------

#####Get a specific course for a specific student

GET: localhost:8083/course/{courseId}/student/{studentId}

---------------

#####Delete a specific course for a specific student

DELETE: localhost:8083/delete/course/{courseId}/fromstudent/{studentId}

---------------