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


