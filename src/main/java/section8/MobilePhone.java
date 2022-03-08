package section8;

import java.util.ArrayList;

public class MobilePhone {


    private String myNumber;
    private ArrayList<Contact> listContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.listContact = new ArrayList<Contact>();
    }


    public boolean addNewContact(Contact contact) {
        if (findContact(contact) > 0) {
            System.out.println("Le contact existe déja");
            return false;
        }
        listContact.add(contact);
        System.out.println("Contact Ajouté !");
        return true;
    }


    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) > 0) {
            int position = findContact(oldContact);
            listContact.set(position, newContact);
            return true;
        }
        System.out.println("Contact does not exist");
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) > 0) {
            listContact.remove(contact);
            return true;
        }
        System.out.println("Contact does not exist");
        return false;
    }

    public int findContact(Contact contact) {   //retourne un index
        return listContact.indexOf(contact);
    }


    public int findContact(String name) {
        for (int i = 0; i < listContact.size(); i++) {   //On parcourt toute la liste de contact
            Contact contact = this.listContact.get(i);  //on donne l'objet contact d'index i dans une variale contact de type Contact
            if (contact.getName().equals(name)) {  // si le nom du contact  est = au nom du contact donné en parametre
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.listContact.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.listContact.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.listContact.get(i).getName() + " -> " +
                    this.listContact.get(i).getPhoneNumber());
        }

    }
}
