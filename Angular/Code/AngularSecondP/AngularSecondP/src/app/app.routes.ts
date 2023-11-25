import { Routes } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { GalaryComponent } from './galary/galary.component';
import { GameComponent } from './game/game.component';

export const routes: Routes = [
    {path: "contactus", component:ContactusComponent},
    {path: "aboutus", component:AboutusComponent},
    {path: "galary", component:GalaryComponent},
    {path: "game", component:GameComponent}
];

