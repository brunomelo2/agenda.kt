package Business
fun main (){

    contactbusiness
}

class contactbusiness {

    fun validate(name :String, phone: String){
        if (name == ""){
            throw Exception ("nome é obrigatório")
        }
        if (phone == ""){
            throw Exception ("numero é obrigatório")
        }
    }
   fun validatedelete(name:String, phone: String){
       if ( name ==""|| phone==""){
           throw Exception ("É necessário escolher um contato antes de remover")
       }
   }
    fun save (name: String , phone: String){
        validate(name, phone)
    }
    fun delete (name: String , phone: String) {
        validatedelete(name, phone)
    }
    }