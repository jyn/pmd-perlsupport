## PMD CPD PerlLanguage Tokenizer

I had the requirement to try and find duplicated lines of perl code. I stumbled
upon this:

http://sourceforge.net/tracker/index.php?func=detail&aid=3479061&group_id=56262&atid=479924

Which is just a code implementation of what was required. Using this requires
the PMD framework which is typically used for Java code. PMD supports a number
of other languages, and implementing the above will give PMD the basic ability
to handle Perl.

This repository is just a useful packaging of the above to make it easier to
build and install Perl support for PMD.

## Software Prerequisites

  * Java JDK
  * Maven (2.0 may work... but I was using 3.0)
  * PMD 4.3
  * git (obviously)

## Installation Instructions

Install the above prerequisites. Make sure you take note of where PMD is
installed.

```shell
cd <pmd location>
mkdir custom
cd custom
git clone https://github.com/jyn/pmd-perlsupport.git
cd pmd-cpd-perl
mvn package
cp target/pmd-cpd-perl-1.0.SNAPSHOT.jar ../lib/.
cd ../bin
./run.sh cpd --minimum-tokens 100 --files <path to perl code> --language Perl
```

