package login

class User
{

       String name
       String address
       String designation
       String email
       Date date

  static constraints =
    {
     name(blank:false)
     address(maxSize:1000, nullable:true )
     designation(blank:true)
     email(nullable:false)
     date() 
    }
}
