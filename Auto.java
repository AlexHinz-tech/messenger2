import sum.kern.Buntstift;
// Die Klasse Auto animiert auf einem vorher instanziierten Bildschirm
// ein fahrendes Auto, indem es wiederholt gezeichnet und wieder gelöscht wird
public class Auto
{
private Buntstift meinStift; // Stift, mit dem das Auto gezeichnet wird
private double x; // horizontale Startkoordinate
private double y; // vertikale Startkoordinate
private Maus dieMaus;//Maus definieren //Fehler bei PC zh

// Konstruktor, hier wird das Auto auch bewegt (animiert)
public Auto(double pX, double pY,double pVelocity)
{
x=pX;
y=pY;
meinStift =new Buntstift();
dieMaus = new Maus();
        this.zeichne();
while(x>100)
{
 this.zeichne();
 this.loesche();

x+=0.2;
    
}
}

 // Methode, in der das Auto gezeichnet wird
public void zeichne()
{
meinStift.setzeFarbe(45);
meinStift.setzeLinienbreite(5);

//Karosserie 
meinStift.hoch();
meinStift.bewegeBis (x,y);
meinStift.runter();
meinStift.bewegeBis(x+150,y-75);
meinStift.bewegeBis(x+350,y-25);
meinStift.bewegeBis(x+350,y+50);
meinStift.bewegeBis(x+300,y+50);
meinStift.bewegeBis(x+250,y+50);
meinStift.bewegeBis(x+100,y+50);
meinStift.bewegeBis(x+50,y+50);
meinStift.bewegeBis(x+0,y+50);
meinStift.bewegeBis(x+0,y+0);

//Reifen
meinStift.hoch();
meinStift.bewegeBis(x+50, y+50);
meinStift.runter();
meinStift.zeichneKreis(30);
meinStift.hoch();
meinStift.bewegeBis(x+275, y+50);
meinStift.runter();
meinStift.zeichneKreis(30);
meinStift.hoch();



}
  // Methode, mit der das Auto gelöscht wird
public void loesche()
{
meinStift.radiere();
this.zeichne();
meinStift.normal();
}

public void fahre ()
    {
        do
        {
            if (x>1200||0>x)
            {
                velocity=velocity*-1;

            }
            if (dieMaus.istGedrueckt())
            {
                this. loesche ();
                x=x+velocity;
                this. zeichne();
            }
        }while (!dieMaus.doppelKlick()) ;
    }
}
