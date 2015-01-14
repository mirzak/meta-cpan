DESCRIPTION = "The \"File::LibMagic\" is a simple perl interface to libmagic \
from the file package (version 4.x or 5.x). You will need both the library \
(libmagic.so) and the header file (magic.h) to build this Perl module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-LibMagic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "config-autoconf-perl-native"
DEPENDS += "perl file"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/File-LibMagic-1.09.tar.gz"

SRC_URI[md5sum] = "812a174944533c00740e06780f771118"
SRC_URI[sha256sum] = "8d49b89bd56451653f35ba6981b7f3a0e61293a4d7ec9acc86fa2e0c97874b03"

S = "${WORKDIR}/File-LibMagic-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"