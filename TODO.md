## Tasques i sessions

### Sessió 14/12-18/12
- Multiplicacions amb Callable i ThreadPoolExecutor
- Exercici examinar alumnes de forma concurrent amb Callable i ThredPoolExecutor
- Procés de transformació Concurrent->Sequencial i a la inversa
- Exercici dels Paletes

 TODO
> Tenim uns paletes que tenen la tasca de contruir una paret a base de posar maons.
> Podeu veure el codi als fitxers [Paleta.java](src/a1/Paleta.java) i [FerParet.java](src/a1/FerParet.java).
> Volem adaptar aquest codi perquè els paletes treballin alhora i no com ara, que fins que un paleta no ha posat els seus maons no continua l'altre.  
> *_Atenció: fer servir Runnable en comptes de Callable_

### Sessió 11-15/01
- [SchedulerThreadPoolExecutor](https://ioc.xtec.cat/materials/FP/Materials/2252_DAM/DAM_2252_M09/web/html/WebContent/u1/a1/continguts.html#executor)  
  
TODO
> Implementar una cursa de cargols
> Cargol és un procés que la seva tasca consisteix en recorrer un metres cada vegada que es posa en marxa.   
> Necessitem un altre procés MonitorCargols per anar imprimint quants metres ha recorregut un cargoll en concret.    
> Cal fer un Main usant ScheduledThreadPoolExecutar per forçar el comportament dels cargols i el seu monitoreig.

### Sessió 18-22/01
- ForkJoin

TODO
> Implementar amb la tècnica Fork-Join estudiada
> Un solució per trobar un número de la sèrie de Fibonacci (1,1,2,3,5,8,13,....), com a l'exemple:   
> Fibonacci(3) = 2  
> Fibonnaci(6) = 8  
> etc.  
> La fòrmula recursiva genèrica és:  
> **Fibonacci(n) = Fibonnacci(n-2) + Fibonacci(n-1)**  


TODO
> Modificar l'exercici [MaximTask.java](src/a2/MaximTask.java) perquè en comtes de resoldre el màxim de l'array
> dividint-lo en dos, el divideixi en tres.

### Sessió 25-29/01

TODO  
> Donada la classe [Client.java](src/a1/Client.java) la qual disposa d'un atribut que és un List que correspon al preu
> dels productes que hi ha posat aquest client   
> **Implementeu** una classe Caixa.java encarregada d'atendre a 1 client (no una llista, un a un)
> de manera que ens digui quin és el preu de tot el seu carret.  
> A continuació implementeu un Main on hi podeu instanciar tants clients i caixes com vulgueu per tal que
> el clients només hagin de fer cua en un caixa, però que les diferents caixes que instancieu puguin treballar
> a la vegada.
> 
> **Qualsevol de les formes estudiades de processos és vàlida**

TODO
> Utilitzant la tècnica de restes successives implementar la operació de divisió entera. Cal utilitzar perquè sigui
> més eficient una classe **RecursivetTask** i com a conseqüència les funcions que resolen el problema de forma recursiva
> i de forma seqüencial.  

### Sessió 01-05/02

- Semàfors i Monitors
- Thread
- Exercici de classe: _Lluita pel comandament a distància_  

### Sessió 08-12/02
- Exercicis de classe:
  - Cursa d'Atletes
