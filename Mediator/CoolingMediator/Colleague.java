
// il mediator si innesta nei suoi colleague
// assicuro che sia lo stesso per tutti 
abstract class Colleague {
    Mediator mediator;

    void setMediator(Mediator m) {
        this.mediator = m;
    }
}

// il colleague si iscrive nel mediator
// che ha ricevuto in construzione
//
// abstract class Colleague {
// Mediator mediator;

// public Colleague(Mediator mediator) {
// this.mediator = mediator;
// mediator.addColleague(this);
// }
// }

// //per colleghi con un solo possibile concrete mediator
// public interface Colleague {
// Mediator mediator = new concreteMediator(); //final

// default void setMediator(Colleague me) {
// mediator.addColleague(me);
// }
// }

// per non impedirmi la derivazione
// e poter avere vari mediator
// mediator sarà attr. privato nei concrete colleague
// public interface Colleague {
// //empty abstraction
// }
