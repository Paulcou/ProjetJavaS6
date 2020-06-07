/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jules
 */
public class Couleur {
       
    private ArrayList<String> couleurs;

    /**
     *
     */
    public Couleur() {
        
        couleurs = new ArrayList<>();
        
        couleurs.add("#DFF2FF");
        couleurs.add("#B0F2B6");
        couleurs.add("#98FB98");
        couleurs.add("#FFA07A");
        couleurs.add("#FDBFB7");
        couleurs.add("#E6E6FA");
    }
    
    /**
     *
     * @param i
     * @return
     */
    public String getCouleurs(int i){
        return couleurs.get(i-1);
    }
}
/*
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
Le latino sine flexione ([laˈtino ˈsine flekˈsjone]), 
aussi appelé interlingua de Peano ou interlingua de l'API (Academia pro Interlingua), 
et abrégé en LsF ou IL, est une langue auxiliaire internationale inventée en 1903 par le mathématicien italien Giuseppe Peano.

Désireux de faciliter les échanges internationaux en mettant fin au morcellement 
linguistique qui règne dans les cercles scientifiques et intellectuels du début du xxe siècle, 
Peano propose de simplifier et de moderniser la langue latine pour lui retirer tous les éléments 
grammaticaux jugés non nécessaires (déclinaisons, conjugaison) jusqu'à obtenir un latino sine flexione, 
c'est-à-dire un « latin sans flexions ».

Également appelé interlingua (« langue internationale »), son système réunit des centaines d'adeptes 
au sein d'une organisation dédiée, l'Academia pro Interlingua, donnant lieu à d'abondantes publications 
et accédant à une certaine notoriété, notamment dans le monde des mathématiques et des sciences. La mort 
de Peano en 1932 met néanmoins un coup d'arrêt au projet, qui périclite après la Seconde Guerre mondiale du fait 
de la montée en puissance de l'anglais sur la scène internationale et de l'apparition en 1952 de l'interlingua de Gode,
une langue construite concurrente. L'avènement d'Internet permet toutefois l'émergence d'une nouvelle communauté de locuteurs
au début du xxie siècle.

En partie calquée sur celles de l'anglais et du chinois, la grammaire du latino est principalement analytique
et se caractérise par son grand nombre de mots invariables et sa quasi-absence de déclinaisons et de conjugaison. 
Dérivé du latin selon des règles simples, son vocabulaire se veut le plus international possible, ce qui fait de la 
langue de Peano une langue a posteriori à tendance schématique. Ce choix d'un vocabulaire latin et d'une grammaire minimaliste, 
par la suite repris par de nombreux autres projets de langues construites, a été largement commenté, tant de manière approbatrice
que critique.
*/