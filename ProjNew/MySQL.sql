--
-- Table structure for table `students`
--
DROP TABLE IF EXISTS students;
/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE students (
admission_id varchar(4) NOT NULL,
student_code varchar(4) NOT NULL,
date_of_counseling date DEFAULT NULL,
department_name varchar(15) NOT NULL,
date_of_admission date DEFAULT NULL,
prefer_college_hostel varchar(20) NOT NULL,
first_graduate varchar(20) NOT NULL,
manager_approval varchar(15) NOT NULL,
admission_fee float(11,2) NOT NULL,
tution_fee float(11,2) NOT NULL,
hostel_fee float(11,2) NOT NULL,
total_college_fee float(11,2) DEFAULT NULL,
final_status_of_admission varchar(25) NOT NULL,
PRIMARY KEY (admission_id),
UNIQUE KEY student_code (student_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

select * from students;