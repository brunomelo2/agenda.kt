package repositorio

import entity.contactentity

class contactrepositorio {

    companion object {
        private val contactlist = mutableListOf<contactentity>()
        fun save (contact: contactentity) {
contactlist.add(contact)
        }

        fun delete(contact: contactentity) {

        }
    }
}