import { Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import path from 'path';
import { AboutusComponent } from './aboutus/aboutus.component';

export const routes: Routes = [
    {path: "contact", component: ContactComponent},
    {path: "about", component: AboutusComponent},
];
