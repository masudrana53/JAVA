import { Routes } from '@angular/router';
import { ContactusComponent } from './contactus/contactus.component';
import { AboutusComponent } from './aboutus/aboutus.component';

export const routes: Routes = [
    {path: "contactus", component:ContactusComponent},
    {path: "aboutus", component:AboutusComponent}
];

