DESCRIPTION = "This module tries to make it easy to build Perl extensions that use \
functions and typemaps provided by other perl extensions. This means \
that a perl extension is treated like a shared library that provides also a \
C and an XS interface besides the perl one."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Depends"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XA/XAOC/ExtUtils-Depends-0.405.tar.gz"

SRC_URI[md5sum] = "caefbca2f173d0cea3f5ac26b6c08a2c"
SRC_URI[sha256sum] = "8ad6401ad7559b03ceda1fe4b191c95f417bdec7c542a984761a4656715a8a2c"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
