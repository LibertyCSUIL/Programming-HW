HOWTO Submit homework
---------------------

Step One, clone and cd into directory:

(don't clone if you've already done so previously)
git clone git@github.com:LibertyCSUIL/Programming-HW.git
cd ~/Programming\ Team/Github\ repos/Programming-HW/


Step Two, update the repository

git pull


Step Three, switch to current year branch and confirm your in the correct branch:

git checkout <year>
git branch


Step Four, enter your named directory:

cd <name>


Step Five, move and add Java homework into current directory:

mv ~/Programming\ Team/Homework/Programming/<homework.class>
git add <homework.class>


Step Six, commit name of homework with the date and time (military):

example: git commit -m "Input, 07/02/2017 06:27"

git commit -m "<homework>, <date> <time>"


Step Seven, push changes:

git push origin 2017



REPEAT EVERY TIME 
